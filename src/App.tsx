import { useState } from "react";
import NavBar from "./components/common/NavBar";

function App() {
  const [isStudentRClicked, setIsStudentRClicked] = useState(false);
  const [isViewListClicked, setIsViewListClicked] = useState(false);

  return (
    <>
      <NavBar
        isStudentRClicked={isStudentRClicked}
        setIsStudentRClicked={setIsStudentRClicked}
        isViewListClicked={isViewListClicked}
        setIsViewListClicked={setIsViewListClicked}
      />
      {isStudentRClicked && <div>Student Registration</div>}
      {isViewListClicked && <div>View Student List</div>}
    </>
  );
}

export default App;
