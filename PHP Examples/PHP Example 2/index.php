<html>
<head>
    <title>Form Submission PHP </title>
</head>

<body>

<?php
    if($_SERVER["REQUEST_METHOD"] == "GET"){
        echo "<form method='post' action='" . $_SERVER['PHP_SELF'] . "'>";
        echo "Name: <input type='text' name='fname'>";
        echo "<input type='submit'>";
        echo "</form>";
    }
    else if ($_SERVER["REQUEST_METHOD"] == "POST"){
        $name = htmlspecialchars($_REQUEST['fname']);
        if (empty($name)) {
            echo "Name is empty";
        } else {
            echo "Welcome" . $name . "! Its so good to see you :)";
        }
    }

?>


</body>
</html>