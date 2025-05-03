<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $databaseName = "users_db";
    
    $conn = mysqli_connect($servername, $username, $password, $databaseName);

    if(!$conn){
        die("Couldn't connect to database" . $conn->connect_error);
    }
?>