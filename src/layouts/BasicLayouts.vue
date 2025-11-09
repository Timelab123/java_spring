<template>
  <div id="basicLayouts">
    <a-layout style="min-height: 100vh">
      <a-layout-header class="header">
        <GlobalHeader />
      </a-layout-header>
      <a-layout-content class="content">
        <router-view />

      </a-layout-content>
      <a-layout-footer class="footer">
      <a href="https://www.codefather.cn" target="blank">鱼皮编程导航</a>
      </a-layout-footer>

    </a-layout>
  </div>
</template>

<script setup lang="ts">
import GlobalHeader from "@/components/GlobalHeader.vue";
</script>

<style scoped>
#basicLayouts .content{
  background: linear-gradient(to right,#fefefe,#fff);
  margin-bottom: 28px;
  padding: 20px;
}

#basicLayouts .footer {
  background-color: #ffffff;
  padding: 16px;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  text-align: center;
}
#basicLayouts .header{
  margin-bottom: 16px;

  color: unset;
  background: white;
}

</style>
