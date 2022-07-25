<template>
<div id="app">
	<OmikujiHeader />
	<div class = "percentList">
		<table border="1">
			<tr>
				<th>運勢名</th>
				<th>運勢数</th>
				<th>割合</th>
			</tr>
			<tr v-for="res in percentList">
				<td>{{ res.fortunename }}</td>
				<td>{{ res.fortunecount }}回</td>
				<td>{{ res.totalpercent }}%</td>
			</tr>
		</table>
	</div>
</div>
</template>

<script>
import axios from 'axios'
import inform from '../models/inform.js'
import OmikujiHeader from '../components/layout/OmikujiHeader.vue'

export default{
	name: 'PercentResult',
	data: function(){
		return {
			percentList: []
		};
	},
	methods: {
		getPercentList(){
			var birthday = inform.birthday;
			var path = "http://localhost:8765/vue/percent/view";
			axios.get(path, {
				params: {
					birthday : birthday
				}
			}).then((res) =>{
				this.percentList = res.data
				console.log(this.percentList)
			}).catch((err) =>{
				console.log(err);
			});
		}
	},
	mounted: function(){
		this.getPercentList();
	}
}

</script>