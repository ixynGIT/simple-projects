<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Time Checker!</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <div class="container bg-light border mt-5 p-4">
    <form class="" action="<?php $_PHP_SELF?>" method="post">
	    <h3>TIME IN CHECKER</h3>
		
        <div class="form-floating mt-3">
            <input type="time" class="form-control" name="txtTimein" >
            <label for = "">Enter Time In: </label>
        </div>

        <div class="form-floating mt-3">
            <input type="time" class="form-control" name="txtTimeout" >
            <label for="floatingDue">Enter Time Out: </label>
        </div>
        <input type="submit" value="CALCULATE" name="btnSubmit" class="btn btn-primary btn-lg mt-3">  
        <br/>
        <?php
        
		if(isset($_POST['txtTimein'])){
            $timeIn = $_POST['txtTimein'];
            $timeOut = $_POST['txtTimeout'];
            
            $startTime = date_create($timeIn);
            $endTime = date_create($timeOut);
            $timeCount = date_diff($startTime, $endTime);
            $no_hrs = $timeCount ->h;
            $no_mins = $timeCount ->i;
            $no_secs = $timeCount ->s;
            $timeInFormat = date_format($startTime, 'h:i A');
            $timeOutFormat = date_format($endTime, 'h:i A');

            if (isset($_POST['txtTimein']) && isset($_POST['txtTimeout']) && $_POST['txtTimein'] <> "" && $_POST['txtTimeout'] <> "") {
				if($no_hrs > 0 && $startTime < $endTime){
					echo "<hr>";
					echo "Time in:  $timeIn / $timeInFormat  <br/>"; 
					echo "Time out:  $timeOut / $timeOutFormat  <br/>";
					echo "<hr>";
					echo "<strong>---You have clocked in for---</strong> <br/>";
					echo "Number of hours:  $no_hrs      <br/>";
					echo "Number of minutes:  $no_mins     <br/>";
					echo "Number of seconds:  $no_secs     <br/>";
				}elseif($startTime == $endTime){
					echo "<div class='alert alert-danger mt-3 p-2 '>
                       <strong>Error!</strong> You have entered the <strong>same time!</strong><div>";
				}elseif($no_hrs == 0 && $startTime < $endTime){
					echo "<div class='alert alert-danger mx-5 mt-3 p-2 text-center'>
                       <strong>Error!</strong> Need to be <strong>clocked in</strong> for <strong>1hr</strong> or <strong>more</strong> to be recorded.<div>";
				}else{
					echo "<div class='alert alert-danger mx-5 mt-3 p-2 text-center'>
                       <strong>Error!</strong> You musn't input <strong>time in</strong> earlier than <strong>time out!</strong><div>";
				}
             } else{
                echo "<div class='alert alert-danger alert-dismissible fade show mt-3'><strong>Error! </strong>Please Enter time in & time out!<button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button></div>";
        }
    }
	?>
    </form>
    </div>
	
    
</body>
</html>
</body>
</html>