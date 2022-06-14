const STORAGE_KEY = 'table-vuejs'//名字随便起
export default {//向往输出，以便组件接收
    fetch() {//我们定义的获取数据的方法
        return JSON.parse(window.localStorage.getItem(STORAGE_KEY)||'[]')

    },
    // 我们用JSON.stringify和JSON.parse把数据转成字符串和解析，这样就方便我们写入tabledata
    save(items) {//我们定义的保存数据的方法
        window.localStorage.setItem(STORAGE_KEY,JSON.stringify(items))

    }
    
}
