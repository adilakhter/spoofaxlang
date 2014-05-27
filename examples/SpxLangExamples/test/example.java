package example1; 
class User {
     
     private string name;
     
     public string get_name {
        return name;
     }
     
     public void set_name (string name) {
        this.name = name;    
     }
     
     private string password;
     
     public string get_password {
        return password;
     }
     
     public void set_password (string password) {
        this.password = password;    
     }
     
     private URL homepage;
     
     public URL get_homepage {
        return homepage;
     }
     
     public void set_homepage (URL homepage) {
        this.homepage = homepage;    
     }
     
 }
class BlogPosting {
     
     private User poster;
     
     public User get_poster {
        return poster;
     }
     
     public void set_poster (User poster) {
        this.poster = poster;    
     }
     
     private string body;
     
     public string get_body {
        return body;
     }
     
     public void set_body (string body) {
        this.body = body;    
     }
     
 }
class URL {
     
     private string location2;
     
     public string get_location2 {
        return location2;
     }
     
     public void set_location2 (string location2) {
        this.location2 = location2;    
     }
     
 }

