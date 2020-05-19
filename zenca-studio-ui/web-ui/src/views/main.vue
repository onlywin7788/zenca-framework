<template>
  <v-container>
    <v-row no-gutters>
      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">Multi-Cloud Integration</p>
          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'development'}">VIEW MORE</v-btn>
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
          <v-btn text color="blue accent-4" :to="{name : 'monitoring'}">VIEW MORE</v-btn>
        </v-card-actions>
      </v-card>

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
    </v-row>

    <v-row no-gutters>
      <v-card max-width="500" class="ma-3">
        <v-card-text>
          <p class="display-2 text--primary">Multi-Cloud Infra Security</p>

          <div class="text--primary">
            See the Information
            <br />Router the Link
          </div>
        </v-card-text>
        <v-card-actions>
          <v-btn text color="blue accent-4" :to="{name : 'security'}">VIEW MORE</v-btn>
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
