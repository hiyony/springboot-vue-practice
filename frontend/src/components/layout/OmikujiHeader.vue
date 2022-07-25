<!-- OmikujiHeader.vue -->

<template>
	<header class="header">
		<h1 class="title">Omikuji Web Service</h1>
		<nav>
      		<router-link to="/">Home</router-link> |
      		<router-link to="/about">About</router-link>
    	</nav>
		<p class="date"> 今日は {{ timestamp }}</p><br>
	</header>
</template>

<script>
export default{
	data(){
		return {
			timestamp: ""
		};
	},
	created(){
		const now = new Date();
		const month = now.getMonth() + 1;
		const date = now.getDate();
		const weekList = new Array("Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.");
		const week = weekList[now.getDay()];
		this.timestamp = `${month}/${date} ${week}`;
	}
};
</script>
<style>

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>