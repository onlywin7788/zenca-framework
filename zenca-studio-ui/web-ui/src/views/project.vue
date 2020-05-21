
<template>
  <v-container>
    <v-flex>
      <v-icon x-large>mdi-menu-right</v-icon>Project
    </v-flex>
    <v-flex class="mt-2 mb-5">
      <v-divider></v-divider>
    </v-flex>

    <v-flex class="ma-2">
      <v-card outlined>
        <v-card-title>
          <v-btn color="primary" tile dark @click.stop="dialog = true">NEW PROJECT</v-btn>
          <v-spacer></v-spacer>
          <v-text-field
            v-model="search"
            append-icon="mdi-magnify"
            label="Search"
            single-line
            hide-details
          ></v-text-field>
        </v-card-title>
        <v-data-table
          :headers="headers"
          :items="project_data"
          :search="search"
          @click:row="selectRow"
        ></v-data-table>
      </v-card>
    </v-flex>

    <!-- new project dialog -->
    <v-dialog v-model="dialog" persistent max-width="600px">
      <v-card>
        <v-card-title>
          <span class="headline">NEW PROJECT</span>
        </v-card-title>
        <v-card-text>
          <v-container>
            <v-row>
              <v-col cols="12">
                <v-text-field label="Project Name *" required></v-text-field>
              </v-col>
              <v-col cols="12">
                <v-text-field label="Desciption" required></v-text-field>
              </v-col>
            </v-row>
          </v-container>
          <small>* Required value</small>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color="blue darken-1" text @click="dialog = false">Close</v-btn>
          <v-btn color="blue darken-1" text @click="dialog = false">Create</v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </v-container>
</template>

<script>
export default {
  data() {
    return {
      dialog: false,
      search: "",
      headers: [
        {
          text: "Name",
          align: "start",
          sortable: false,
          value: "name"
        },
        { text: "Description", value: "desc" }
      ],
      project_data: [
        {
          id: 1,
          name: "default-project",
          desc: "Tutorial project for beginner"
        },
        {
          id: 2,
          name: "gcp-data-integration",
          desc: "Google cloud data integration test"
        },
        {
          id: 3,
          name: "big-data-integration",
          desc: "Big data (hadoop file system) integration test"
        }
      ]
    };
  },
  methods: {
    selectRow: function(item, row) {
      //item.name - selected id
      alert(item.id);
    }
  }
};
</script>
