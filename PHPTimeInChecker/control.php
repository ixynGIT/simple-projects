<?php

date_default_timezone_set('asia/manila');
$today = date('l, jS \of F Y');


if(isset($_POST['loanInput'])){
	$timeIn = $_POST['txtTimein'];
	$timeOut = $_POST['txtTimeout'];
	
	$startTime = date_create($timeIn);
	$endTime = date_create($timeOut);
	$Timecount = date_diff($startTime, $endTime);
    $no_hrs = $Timecount ->h;
    $no_mins = $Timecount ->i;
    $no_secs = $Timecount ->s;
    $timeInFormat = date_format($startTime, 'h:i A');
    $timeOutFormat = date_format($endTime, 'h:i A');
	
    echo "time in:  $timeIn      <br/>";
    echo "time in Format:  $timeInFormat      <br/>";

    echo "time out:  $timeOut     <br/>";
    echo "time in Format:  $timeOutFormat      <br/>";

    echo "number of hours:  $no_hrs      <br/>";
    echo "number of minutes:  $no_mins     <br/>";
    echo "number of seconds:  $no_secs     <br/>";






	//DATE TODAY && INPUT DATES
	echo "<div class='alert alert-info alert-dismissible fade show mt-3 text-center'> 
	  <hr>
	  <span class='badge bg-info'><strong>Date today: $today</strong></span> <br/>
	  <hr>
	  Loan date is: $loanDate<br/>
	  Due date is: $dueDate<br/>
	  <button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button></div>";

	//DATE DIFFERENCE
	if($loanCreate < $dueCreate){
      echo "<div class='alert alert-success alert-dismissible fade show mt-3 text-center'> 
	  <hr>
	  <span class='badge bg-success'><strong>NOT YET DUE <br/>
	  DUE IN:</strong> $dueCountdown </span> <br/>
	  <hr>
	  No. of days before due: <span class='badge bg-success'>$dayTotal</span><br/>
	  No. of months before due: <span class='badge bg-success'>$monthTotal</span> <br/>
	  No. of years before due: <span class='badge bg-success'>$yearTotal</span><br/>
	  <button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button></div>";  
	}elseif($loanCreate == $dueCreate){
		echo "<div class='alert alert-warning alert-dismissible fade show mt-3 text-center'> 
	  <hr>
	  <span class='badge bg-warning'><strong>DUE TODAY</strong></span> <br/>
	  <hr>
	  <button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button></div>";
	}else{
	  echo "<div class='alert alert-danger alert-dismissible fade show mt-3 text-center'> 
	  <hr>
	  <span class='badge bg-danger'><strong>DATE LAPSED! <br/>
	  Lapsed by:</strong> $dueCountdown</strong></span> <br/>
	  <hr>
	  No. of days lapse: <span class='badge bg-danger'>$dayTotal</span><br/>
	  No. of months lapse: <span class='badge bg-danger'>$monthTotal</span> <br/>
	  No. of years laps: <span class='badge bg-danger'>$yearTotal</span><br/>
	  <button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button></div>";
	}
}


?>