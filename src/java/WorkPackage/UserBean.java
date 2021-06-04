package WorkPackage;

	
   public class UserBean {
	
    
      private String password;
      private String name;
      private String phone;
      private String address;
      private String username;
     
      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
      

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
      public boolean valid;
	
	
	

      public String getPassword() {
         return password;
	}

      public void setPassword(String newPassword) {
         password = newPassword;
	}
	
			
      public String getUsername() {
         return username;
			}

      public void setUserName(String newUsername) {
         username = newUsername;
			}

				
      public boolean isValid() {
         return valid;
	}

      public void setValid(boolean newValid) {
         valid = newValid;
	}	
}
