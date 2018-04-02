import groovy.json.*
node('Lubuntu_VM'){
properties([
        parameters([
            string(name: 'JSONParams', defaultValue: '{}', description: 'JSONParams', trim: false )
          ])
   ])
   
def params = new JsonSlurperClassic().parseText("${JSONParams}")
    println 'JSON Params : '+"${params}"
    
def map=[:]
map.put("url","${env.BUILD_URL}")
map.put("summary","abc")
def body = new JsonBuilder(map).toPrettyString()
    println body
}

