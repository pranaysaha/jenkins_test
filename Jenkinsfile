import groovy.json.*
node('maven-ssh-slave'){
properties([
        parameters([
            string(name: 'JSONParams', defaultValue: '{}', description: 'JSONParams', trim: false )
          ])
   ])
   
def params = readJSON text:"${JSONParams}"
    println 'JSON Params : '+"${params}"
    
def map=[:]
map.put("url","${env.BUILD_URL}")
map.put("summary","abc")
def body = new JsonBuilder(map).toPrettyString()
    println body
}

