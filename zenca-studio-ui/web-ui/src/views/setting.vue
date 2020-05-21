<template>
  <v-container>
    <v-flex>
      <v-icon x-large>mdi-menu-right</v-icon>Setting
    </v-flex>
    <v-flex class="mt-2 mb-5">
      <v-divider></v-divider>
    </v-flex>

    <v-row align="center" class="ma-2">
      <v-row justify="space-around">
        <v-switch v-model="accordion" class="ma-2" label="Option1"></v-switch>
        <v-switch v-model="popout" class="ma-2" label="Option2"></v-switch>
        <v-switch v-model="inset" class="ma-2" label="Option3"></v-switch>
        <v-switch v-model="multiple" class="ma-2" label="Option4"></v-switch>
        <v-switch v-model="disabled" class="ma-2" label="Option5"></v-switch>
        <v-switch v-model="readonly" class="ma-2" label="Option6"></v-switch>
        <v-switch v-model="focusable" class="ma-2" label="Option7"></v-switch>
        <v-switch v-model="flat" class="ma-2" label="Option8"></v-switch>
        <v-switch v-model="hover" class="ma-2" label="Option9"></v-switch>
        <v-switch v-model="tile" class="ma-2" label="Option10"></v-switch>
      </v-row>

      <v-expansion-panels
        :accordion="accordion"
        :popout="popout"
        :inset="inset"
        :multiple="multiple"
        :focusable="focusable"
        :disabled="disabled"
        :readonly="readonly"
        :flat="flat"
        :hover="hover"
        :tile="tile"
      >
        <v-expansion-panel v-for="(item,i) in 5" :key="i">
          <v-expansion-panel-header>Setting Option Viewer - click for detail view</v-expansion-panel-header>
          <v-expansion-panel-content>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</v-expansion-panel-content>
        </v-expansion-panel>
      </v-expansion-panels>
    </v-row>
  </v-container>
</template>