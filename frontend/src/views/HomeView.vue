<template>
  <div class="home">
    <OmikujiInput />
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
  </div>
</template>

<script>
// @ is an alias to /src
import OmikujiInput from '@/components/OmikujiInput.vue'
export default {
  name: 'HomeView',
  components: {
	OmikujiInput
  }
}
</script>