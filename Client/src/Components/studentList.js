import React, { useState, useEffect } from 'react';
import axios from 'axios';
// import { Link } from 'react-router-dom';
import './list.css';


function StudentList() {
  const [studentData, setStudentData] = useState([]);
  const [sortedStudentData, setSortedStudentData] = useState([]);

  function getData() {
    const url = 'http://localhost:8084/data/student/getall';
    axios.get(url).then((response) => {
      setStudentData(response.data);
    });
  }

  useEffect(() => {
    getData();
  }, []);

  // Sort the student data by student name
  useEffect(() => {
    const sortedData = [...studentData].sort((a, b) =>
      a.studentname.localeCompare(b.studentname)
    );
    setSortedStudentData(sortedData);
  }, [studentData]);

  return (
    <div className='listdiv'>
      <section className="intro" style={{ backgroundColor: 'white' }}>
        <div className="container">
          <div className="row">
            <div className="col-6">
              <h3>STUDENT LIST</h3>
            </div>
            <div className="col-6 text-right">
              {/* <Link to="/add" className="btn btn-primary">
                Add Student
              </Link> */}
            </div>
          </div>
          <div className="row">
            <div className="col-6">
              <div className="">
                <table className="table table-dark table-bordered mb-0">
                  <thead>
                    <tr>
                    <th scope="col">Sl no</th>
                      <th scope="col">Student Name</th>
                      <th scope="col">Date of Birth</th>
                      <th scope="col">Class</th>
                      <th scope="col">Division</th>
                      <th scope="col">Gender</th>
                    </tr>
                  </thead>
                  <tbody>
                    {sortedStudentData.map((student) => (
                      <tr key={student._id}>
                        <td>{student.admissionNumber}</td>
                        <td>{student.studentname}</td>
                        <td>{student.studentdob}</td>
                        <td>{student.studentclass}</td>
                        <td>{student.studentdivision}</td>
                        <td>{student.gender}</td>
                       

                      </tr>
                    ))}
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <div className="gradient-custom-2 h-100">
          <div className="mask d-flex align-items-center h-100"></div>
        </div>
      </section>
    </div>
  );
}

export default StudentList; 