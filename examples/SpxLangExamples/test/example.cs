namespace example1
{
    class User 
    {
     public string  name{ get; set; }
     public string  password{ get; set; }
     public URL  homepage{ get; set; }
     
    }
    
    class BlogPosting 
    {
     public User  poster{ get; set; }
     public string  body{ get; set; }
     
    }
    
    class URL 
    {
     public string  location2{ get; set; }
     
    }
    
    
}
