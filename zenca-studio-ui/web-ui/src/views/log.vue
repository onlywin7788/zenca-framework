<template>
  <v-container>
    <v-flex>
      <v-icon x-large>mdi-menu-right</v-icon>Event Log
    </v-flex>
    <v-flex class="mt-2 mb-5">
      <v-divider></v-divider>
    </v-flex>
    <v-card outlined>
      <v-data-table
        :headers="headers"
        :items="desserts"
        :items-per-page="10"
        @click:row="selectRow"
        class="elevation-1"
      ></v-data-table>
    </v-card>
    <v-navigation-drawer v-model="drawer" absolute temporary="false" right>
      <v-flex class="ma-3">
        <v-list-item-title>Description</v-list-item-title>

        <v-divider></v-divider>
        <v-list-item-title>{{ descTitle }}</v-list-item-title>
        <v-list-item-title>{{ descTitle }}</v-list-item-title>
        <v-list-item-title>{{ descTitle }}</v-list-item-title>
        <v-list-item-title>{{ descTitle }}</v-list-item-title>
        <v-list-item-title>{{ descTitle }}</v-list-item-title>
        <v-list-item-title>{{ descTitle }}</v-list-item-title>
        <v-list-item-title>{{ descTitle }}</v-list-item-title>
      </v-flex>

      <v-list dense>
        <v-list-item v-for="drawerItem in items" :key="drawerItem.title" link>
          <v-list-item-icon>
            <v-icon>{{ drawerItem.icon }}</v-icon>
          </v-list-item-icon>

          <v-list-item-content></v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
  </v-container>
</template>


<script>
export default {
  methods: {
    selectRow: function(item, row) {
      this.drawer = true;
    }
  },
  data() {
    return {
      drawer: null,
      descTitle: "TEST VIEW",
      headers: [
        { text: "Time", value: "time" },
        { text: "Event Level", value: "level" },
        { text: "System Class", value: "class" },
        { text: "Summary", value: "summary" }
      ],
      desserts: [
        {
          time: "2020.05.20 12:34:55.212",
          level: "warning",
          class: "System",
          summary:
            "System network latency is too slow. Inquiery IT admin and send us the feedback"
        },
        {
          time: "2020.05.20 12:35:55.212",
          level: "Info",
          class: "Service",
          summary:
            "Service deploy is completed. Service Name : [FILE_TO_DB_FOR_TEST]"
        },
        {
          time: "2020.05.20 12:35:57.212",
          level: "Application",
          class: "Service",
          summary:
            "Service deploy is cancled. Service Name : [FILE_TO_DB_FOR_TEST]"
        },
        {
          time: "2020.05.20 12:37:52.212",
          level: "Info",
          class: "Application",
          summary: "Service version is changed : v1.0.0 -> v1.0.1"
        },
        {
          time: "2020.05.20 12:40:59.212",
          level: "Warning",
          class: "Service",
          summary:
            "Service [LOAD_RUNNER_TEST] is force stop. user : [onlywin7788]"
        },
        {
          time: "2020.05.20 12:40:59.212",
          level: "Warning",
          class: "Service",
          summary:
            "Service [LOAD_RUNNER_TEST_002] is force stop. user : [onlywin7788]"
        },
        {
          time: "2020.05.20 12:34:55.212",
          level: "Error",
          class: "Network",
          summary: "Not reached tranasction-Proxy Service. [HOST : RMS_DECPT]"
        },
        {
          time: "2020.05.20 12:34:55.212",
          level: "Error",
          class: "Network",
          summary: "Not reached tranasction-Proxy Service. [HOST : RMS_DECPT]"
        },
        {
          time: "2020.05.20 12:34:55.212",
          level: "Error",
          class: "Network",
          summary: "Not reached tranasction-Proxy Service. [HOST : RMS_DECPT]"
        },
        {
          time: "2020.05.20 12:34:55.212",
          level: "Error",
          class: "Network",
          summary: "Not reached tranasction-Proxy Service. [HOST : RMS_DECPT]"
        }
      ]
    };
  }
};
</script>