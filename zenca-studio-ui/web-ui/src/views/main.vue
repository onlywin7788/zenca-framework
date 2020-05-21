<template>
  <v-container>
    <v-flex>
      <v-icon x-large>mdi-menu-right</v-icon>Main Dashboard
    </v-flex>
    <v-flex class="mt-2 mb-5">
      <v-divider></v-divider>
    </v-flex>
    <v-row no-gutters>
      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">Multi-Cloud Integration Project</p>
          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'project'}">VIEW MORE</v-btn>
        </v-card-actions>
      </v-card>

      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">Trsansaction Service Management</p>

          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'service'}">VIEW MORE</v-btn>
        </v-card-actions>
      </v-card>

      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">Transaction Service Monitoring</p>

          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'monitoring'}">VIEW MORE</v-btn>
        </v-card-actions>
      </v-card>
    </v-row>

    <v-row no-gutters>
      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">Cloud Data Statics & Analytics</p>

          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'statics'}">VIEW MORE</v-btn>
        </v-card-actions>
      </v-card>

      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">User Management & Permission</p>

          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'identity'}">VIEW MORE</v-btn>
        </v-card-actions>
      </v-card>

      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">System Maintenance Event Log</p>

          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'log'}">VIEW MORE</v-btn>
        </v-card-actions>
      </v-card>
    </v-row>
  </v-container>
</template>
