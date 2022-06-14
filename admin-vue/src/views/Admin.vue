<template>
<div>
  <el-container>
     <Aside></Aside>
    <el-container class="site_set">
      <el-header>Header</el-header>
      <el-main>Main</el-main>
    </el-container>
  </el-container>




</div>
</template>

<script>
import Aside from '../components/Aside'
import Head from "../components/Head";
export default {
  name:"Admin",
  components:{Aside},

    data() {
      const item = {
        date: '2016-05-02',
        name: '王小虎',
        address: '上海市普陀区金沙江路 1518 弄'
      };
      return {
        tableData: Array(20).fill(item)
      }

  }
}
</script>

<style scoped>
.el-header {
  background-color: #B3C0D1;
  color: #333;
  line-height: 60px;
}
.site_set {
  position: absolute;
  left: 200px;
}
.el-aside {
  color: #119cdd;
}
</style>
