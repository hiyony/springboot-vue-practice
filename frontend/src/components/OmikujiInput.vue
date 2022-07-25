<!-- OmikujiInput.vue -->
<template>
	<div class="input">
		<form @submit="formSubmit">
			<span>お誕生日を入力してください</span>
			<input type="text" id="birthday" v-model="inform.birthday" placeholder="yyyyMMddの形式で入力" required>
			<button type="submit" name="btn" @click="getBirthday">確認する</button>
			<p v-if="message.inform">{{ message.inform[0] }}</p>
			<br><hr><br>
			上にお誕生日を入力してクリックしてください！<br>
			<button type="submit" name="btn" @click="getHalfResult">過去半年の結果リスト</button>
			<button type="submit" name="btn" @click="getPercentResult">過去結果のおみくじ割合</button>
		</form>
	</div>
</template>

<script>
import Inform from '../models/inform';
import validate from '../validate';
export default{
	name: 'getbirthday',
	data(){
		return {
			inform: new Inform(''),
			loading: false,
			message: { inform: [] }
		}
	},
	computed: {
		getBday(){
			return this.$store.state.initialState.status.getBday;
		}
	},
	created(){
		if(this.getBday){
			this.$router.push('/vue/input');
		}
	},
	watch: {
		inform(val){
			this.message.inform = validate("inform", val)
		}
	},
	methods: {
		formSubmit(){
			this.message.inform = validate("inform", this.inform);
		},
		getBirthday(evt){
			evt.preventDefault();
			console.log(this.inform.birthday);
			this.$router.push({})
		},
		getHalfResult(evt){
			console.log(this.inform.birthday);
		},
		getPercentResult(evt){
			console.log(this.inform.birthday);
		}
	}
}
</script>







