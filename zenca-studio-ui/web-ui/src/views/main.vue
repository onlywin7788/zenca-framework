<template>
  <v-container>
    <v-flex>
      <v-icon x-large>mdi-menu-right</v-icon>Main Dashboard
    </v-flex>
    <v-flex class="mt-2 mb-5">
      <v-divider></v-divider>
    </v-flex>
    <v-flex class="ma-2">
      <v-row>
        <v-col>
          <v-card class="pa-3" outlined tile>
            <v-card-text>
              <p class="display-1 text--primary">Multi-Cloud Integration Project</p>
              <div class="text--primary">
                See the Information
                <br />Router the Link
              </div>
            </v-card-text>
            <v-card-actions>
              <v-btn text color="blue accent-4" :to="{name : 'project'}">VIEW MORE</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col>
          <v-card class="pa-3" outlined tile>
            <v-card-text>
              <p class="display-1 text--primary">Trsansaction Service Management</p>

              <div class="text--primary">
                See the Information
                <br />Router the Link
              </div>
            </v-card-text>
            <v-card-actions>
              <v-btn text color="blue accent-4" :to="{name : 'service'}">VIEW MORE</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col>
          <v-card class="pa-3" outlined tile>
            <v-card-text>
              <p class="display-1 text--primary">Transaction Service Monitoring</p>

              <div class="text--primary">
                See the Information
                <br />Router the Link
              </div>
            </v-card-text>
            <v-card-actions>
              <v-btn text color="blue accent-4" :to="{name : 'monitoring'}">VIEW MORE</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
      </v-row>

      <v-row>
        <v-col>
          <v-card class="pa-3" outlined tile>
            <v-card-text>
              <p class="display-1 text--primary">Transaction Service Data Statics & Analytics</p>
              <div class="text--primary">
                See the Information
                <br />Router the Link
              </div>
            </v-card-text>
            <v-card-actions>
              <v-btn text color="blue accent-4" :to="{name : 'statics'}">VIEW MORE</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col>
          <v-card class="pa-3" outlined tile>
            <v-card-text>
              <p class="display-1 text--primary">User Management & Permission</p>

              <div class="text--primary">
                See the Information
                <br />Router the Link
              </div>
            </v-card-text>
            <v-card-actions>
              <v-btn text color="blue accent-4" :to="{name : 'identity'}">VIEW MORE</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col>
          <v-card class="pa-3" outlined tile>
            <v-card-text>
              <p class="display-1 text--primary">Multi-Cloud Maintenance Event Log</p>

              <div class="text--primary">
                See the Information
                <br />Router the Link
              </div>
            </v-card-text>
            <v-card-actions>
              <v-btn text color="blue accent-4" :to="{name : 'log'}">VIEW MORE</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
      </v-row>
    </v-flex>
  </v-container>
</template>