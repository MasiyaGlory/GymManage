<template>
  <div >

    <div class="content-header">

      <h1>交易查询系统</h1>

    </div>

    <div class="app-container">

      <div class="box">

        <div class="filter-container">
          <el-row>

            <el-col :span="3"><el-input  placeholder="订单号" v-model="pagination.queryString"  class="filter-item"></el-input></el-col>

            <el-col :span="2"><el-button  @click="getAll()" class="butT">Check</el-button></el-col>

          </el-row>


        </div>

        <el-table size="small" current-row-key="id" :data="dataList" stripe highlight-current-row>

          <el-table-column  fixed prop="orderid" align="center" label="订单号"></el-table-column>

          <el-table-column prop="costtime" label="消费时间" align="center"></el-table-column>

          <!--          <el-table-column prop="passwd" label="密码"  align="center"></el-table-column>-->

          <el-table-column prop="changemoney" label="花费金额"  align="center"></el-table-column>

          <el-table-column prop="leftmoney" label="余额" align="center"></el-table-column>

          <el-table-column prop="comment" label="备注" align="center" ></el-table-column>

<!--          <el-table-column prop="starttime" label="开始时间" align="center"></el-table-column>-->

<!--          <el-table-column prop="leftcurse" label="剩余课程" align="center"></el-table-column>-->
        </el-table>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "AdminOrder",
  data(){
    return{
      dataList: [],
      pagination:{}
    }
  },
  created() {
    this.getAll();
  },
  methods:{
    getAll() {
      //发送ajax请求
      axios.get('http://localhost:8080/adminorder/GetAll').then((res) => {
        this.dataList = res.data;
        console.log(res.data)
      });
    },
  }
}
</script>

<style scoped>

</style>