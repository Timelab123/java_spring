import { computed, ref } from 'vue'
import { defineStore } from 'pinia'

/**
 * 存储用户登录信息状态
 */
export const useLoginUserStore = defineStore('loginUser', () => {
  const loginUser = ref<any>({
    userName: '未登录',
  });

  async function fetchLoginUser() {
    // todo


    setTimeout(() =>{
      loginUser.value = {userName:'测试用户',id:1}
    },3000)
  }

  /**
   * 设置登录用户
   * @param newLoginUser
   */
  function setLoginUser(newLoginUser: any) {
    loginUser.value = newLoginUser
  }


  return { loginUser, fetchLoginUser, setLoginUser }
})
