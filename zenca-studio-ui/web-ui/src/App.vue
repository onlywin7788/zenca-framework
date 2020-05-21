<template>
  <v-app id="inspire">
    <v-navigation-drawer v-model="drawer" :clipped="$vuetify.breakpoint.lgAndUp" app>
      <v-list dense>
        <template v-for="item in items">
          <v-row v-if="item.heading" :key="item.heading" align="center">
            <v-col cols="6">
              <v-subheader v-if="item.heading">{{ item.heading }}</v-subheader>
            </v-col>
            <v-col cols="6" class="text-center">
              <a href="#!" class="body-2 black--text">EDIT</a>
            </v-col>
          </v-row>
          <v-list-group
            v-else-if="item.children"
            :key="item.text"
            v-model="item.model"
            :prepend-icon="item.model ? item.icon : item['icon-alt']"
            append-icon
          >
            <template v-slot:activator>
              <v-list-item-content>
                <v-list-item-title>{{ item.text }}</v-list-item-title>
              </v-list-item-content>
            </template>
            <v-list-item v-for="(child, i) in item.children" :key="i">
              <v-list-item-action v-if="child.icon">
                <v-icon>{{ child.icon }}</v-icon>
              </v-list-item-action>
              <v-list-item-content>
                <v-list-item-title>{{ child.text }}</v-list-item-title>
              </v-list-item-content>
            </v-list-item>
          </v-list-group>
          <v-list-item v-else :key="item.text" link :to="{name : item.view}">
            <v-list-item-action>
              <v-icon>{{ item.icon }}</v-icon>
            </v-list-item-action>
            <v-list-item-content>
              <v-list-item-title>{{ item.text }}</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </template>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar :clipped-left="$vuetify.breakpoint.lgAndUp" app color="blue darken-3" dark>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title style="width: 300px" class="ml-0 pl-4">
        <span class="hidden-sm-and-down">Zenca Cloud Studio</span>
      </v-toolbar-title>

      <v-spacer></v-spacer>
      <v-icon>mdi-account-box</v-icon>
      <span class="ma-2">Kim. Lucas</span>
      <span class="ma-2">|</span>
      <span class="ma-2">Help</span>
    </v-app-bar>
    <v-content>
      <router-view />
    </v-content>
  </v-app>
</template>

<script>
export default {
  props: {
    source: String
  },
  data: () => ({
    dialog: false,
    drawer: null,
    items: [
      { icon: "mdi-home", text: "Main", view: "main" },
      { icon: "mdi-developer-board", text: "Project", view: "project" },
      { icon: "mdi-apps", text: "Service", view: "service" },
      { icon: "mdi-monitor", text: "Monitoring", view: "monitoring" },
      { icon: "mdi-file-chart", text: "Statics", view: "statics" },
      { icon: "mdi-contacts", text: "Idnetity", view: "identity" },
      { icon: "mdi-file", text: "Event Log", view: "log" },
      { icon: "mdi-folder-upload", text: "Plugin", view: "plugin" },
      { icon: "mdi-shield", text: "Security", view: "security" },
      {
        icon: "mdi-brightness-5",
        text: "setting",
        view: "setting"
      },
      { icon: "mdi-help-circle", text: "About", view: "about" }
    ]
  })
};
</script>
