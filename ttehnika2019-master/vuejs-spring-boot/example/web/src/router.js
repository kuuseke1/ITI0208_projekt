import Vue from 'vue';
import Router from 'vue-router';
import Navigation from './components/Navigation.vue';
import WelcomePage from './views/WelcomePage.vue';

Vue.use(Router);


export default new Router({
    routes: [
        {
            path: '/Home',
            name: 'WelcomePage',
            component: WelcomePage
        },
    ]
});