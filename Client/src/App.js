import React from 'react';
import Student from './Components/studentList';
import Addstudents from './Components/addStudents';
import './App.css';

function App() {

  
  return (
    <div className="App">
     <div className="row">
     <div className="col-md-6">
   
     
     <Addstudents/>

 

 </div>
 <div className="col-md-6">
 <Student/>  
 </div>
 </div>
    </div>
    

  );
}

export default App;
