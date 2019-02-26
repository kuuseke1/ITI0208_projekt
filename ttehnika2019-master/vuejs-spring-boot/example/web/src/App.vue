<template>
  <header>
    <div id="app">
      <nav class="menu">
        <div class="container">
          <div class="menu-bar">

            <ul class="header-ul" style="display: flex">
              <li>
                <h1 class="header-logo"> Training App</h1>
              </li>

              <div class="menu-buttons">
                <li>
                  <router-link to="/Home">Home</router-link>
                </li>
              </div>
            </ul>
          </div>
        </div>
      </nav>
      <div class="container">
        <transition name="moveInUp">
          <router-view></router-view>
        </transition>
      </div>
  </div>
  </header>

  <!-- SIIN MEIE ID -->

     <!--msg="Hehehehe"--->
</template>

<script>

import HelloWorld from './components/HelloWorld.vue'
import axios from "axios";
import WelcomePage from "./views/WelcomePage.vue"
import Navigation from "./components/Navigation.vue";

export default {
  name: 'App',
  component: {
    WelcomePage
  },
  data() {
    return {
      hello: null
    }
  },
  mounted () {
    axios.get('http://localhost:8080/hello-world').then(response => (this.hello = response.data));
  }
}

</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
