<template>

    <v-card outlined>
        <v-card-title>
            Dashboard # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="OrderId" v-model="item.orderId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Menu" v-model="item.menu" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="IsAccepted" v-model="item.isAccepted" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="IsRejected" v-model="item.isRejected" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="IsStarted" v-model="item.isStarted" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="IsFinished" v-model="item.isFinished" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashboardViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashboards/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

