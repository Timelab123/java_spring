

<template>
<div id="app">
  <BasicLayouts />
</div>
</template>




<script setup lang="ts">
import BasicLayouts from '@/layouts/BasicLayouts.vue'

import { healthUsingGet } from '@/service/api/mainController.ts'
import { useLoginUserStore} from '@/stores/useLoginUserStore.ts'

const loginUserStore = useLoginUserStore()
loginUserStore.fetchLoginUser()


healthUsingGet().then((res) => {
  console.log(res)
})
</script>

<style scoped>

</style>
