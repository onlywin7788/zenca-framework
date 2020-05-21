import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("@/views/main.vue"),
  },
  {
    path: "/home",
    name: "main",
    component: () => import("@/views/main.vue"),
  },
  {
    path: "/project",
    name: "project",
    component: () => import("@/views/project.vue"),
  },
  {
    path: "/service",
    name: "service",
    component: () => import("@/views/service.vue"),
  },
  {
    path: "/monitoring",
    name: "monitoring",
    component: () => import("@/views/monitoring.vue"),
  },
  {
    path: "/statics",
    name: "statics",
    component: () => import("@/views/statics.vue"),
  },
  {
    path: "/plugin",
    name: "plugin",
    component: () => import("@/views/plugin.vue"),
  },
  {
    path: "/security",
    name: "security",
    component: () => import("@/views/security.vue"),
  },
  {
    path: "/identity",
    name: "identity",
    component: () => import("@/views/identity.vue"),
  },
  {
    path: "/setting",
    name: "setting",
    component: () => import("@/views/setting.vue"),
  },
  {
    path: "/log",
    name: "log",
    component: () => import("@/views/log.vue"),
  },
  {
    path: "/about",
    name: "about",
    component: () => import("@/views/about.vue"),
  },
];

const router = new VueRouter({
  mode: "history",
  routes,
});

export default router;
