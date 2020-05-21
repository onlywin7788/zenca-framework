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
              <p class="font-weight-bold title">Multi-Cloud Integration Project</p>
              <div class="text--primary">
                Cloud-based Data Integration
                <br />Web-Based Service Development
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
              <p class="font-weight-bold title">Service Management</p>

              <div class="text--primary">
                Service status management per host-server
                <br />Managing Service for developer & infra Team
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
              <p class="font-weight-bold title">Platform Monitoring</p>

              <div class="text--primary">
                Support monitoring with web-based UI
                <br />Manage the safe system with graph chart
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
              <p class="font-weight-bold title">Transaction Data Statics & Analytics</p>
              <div class="text--primary">
                Web-based transaction data statics service
                <br />Support the various visualization
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
              <p class="font-weight-bold title">User Management & Permission</p>

              <div class="text--primary">
                Manage user account and permission
                <br />Block the unsafe user action
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
              <p class="font-weight-bold title">Service Maintenance Event Log</p>

              <div class="text--primary">
                Check the platform event log on web UI
                <br />Support various event class and application type
              </div>
            </v-card-text>
            <v-card-actions>
              <v-btn text color="blue accent-4" :to="{name : 'log'}">VIEW MORE</v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
      </v-row>
    </v-flex>

    <v-footer absolute class="font-weight-medium">
      <v-col class="text-center" cols="12">
        <p>Released under the Cloud-based Subscription.</p>Copyright © 2020 Zenca-Framework, Lucas Kim
      </v-col>
    </v-footer>
  </v-container>
</template>