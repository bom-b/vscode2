import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/user',
    name: 'list',
    component: () => import(/* webpackChunkName: "listview" */ '../views/ListView.vue')
  },
  {
    // DetailView
    // path: '/user/detail/',
    // path: '/user/detail/:num',
    path: '/user/detail/:num/:name/:email',
    name: 'DetailView',
    component: () => import(/* webpackChunkName: "DetailView" */ '../views/DetailView.vue')
  },
  {
    path: '/myprofile',
    name: 'myprofile',
    component: () => import(/* webpackChunkName: "myprofile" */ '../views/myprofile.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
