<template>
  <div id="app">
  	<OmikujiHeader />
    <router-view/>
  </div>
</template>
<script>

import OmikujiHeader from '@/components/layout/OmikujiHeader.vue'
import OmikujiPercent from '@/components/OmikujiPercent.vue'

export default {
	name: 'App',
	components: {
		OmikujiHeader
	}
}
</script>
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
