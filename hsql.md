//http://www.hsqldb.org/download/hsqldb_251_jdk6/hsqldb-2.3.8-jdk6.jar



// on se place dans le bon répétoire 
	
// java -cp hsqldb-2.3.8-jdk6.jar org.hsqldb.Server --database.0 file:mydb --dbname.0 xdb
	
// java -cp hsqldb-2.3.8-jdk6.jar org.hsqldb.util.DatabaseManagerSwing
	


// dansles options de connectiono on choisis : server
// jdbc:hsqldb:hsql://localhost/xdb

// via l'interface on créer une table et on insère des données

// CREATE TABLE PERSON (name VARCHAR(100),firstName VARCHAR(100))
	
// insert into person (name,firstname) values ('velay','seb')

``` 
public static void main(String[] args) {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sql = "select NAME, FIRSTNAME from person";
		
		ResultSet rs = null;
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			Statement s = conn.createStatement();
			s.execute(sql);
			rs = s.getResultSet();
			
			while(rs.next()) {
				String name = rs.getString("NAME");
				String firstName = rs.getString("FIRSTNAME");
				System.out.println(name +" "+firstName);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
  ```
