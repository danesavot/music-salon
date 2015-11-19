
GitHub Project URL: https://github.com/danesavot/music-salon

Music Salon:

The main purpose of this project is to provide music entertainment with the collection of music categorized by popularity, new release, and etc. It also provides the music information such as album, singer, date release, writer, and publisher. The registered users can bookmark their favorite musics by creating a playlist. 

Technologies and feature list:
	
- Spring and Spring MVC
- Open Session in View using Spring Abstraction 
- Apache Tile for page templet
- Latest Spring Security (4.0.3) 
- URL based Authorization
- Controller Advice
- JSP and Security Tag Library 
- Hibernate ORM, Validation 
- Internationalization
- Multipart File Upload 
- Spring Dependency Injection
- Bootstrap 
- MySQL


Project Setup:

- Create SQL Schema in MySQL named music_salon
- Configure the uploading image and music path in fileupload.properties
	server.upload.album.path=C:/music-salon/album/
	server.upload.music.path=C:/music-salon/album/

User Manual: 

- Add Music by Admin:
	
	Login as admin user/password: qin/qin
	Add a new album with image file uploaded: Admin -> New Album
	Add a new Category: Admin -> New Category
	Add new music with music file uploaded: Admin -> New Music
	
- Add Favorite with normal user:
	
	Logout, and then Sign up a new user: test
	Click “Add To Favorites” of the music, the music will add to my Favorite list automatically
	Click “Favorite” to view the music of your favorites.
	
- Play the music:
	Click “Detail” of the music, the music will add to my Favorite list automatically.
	Enjoy! 

