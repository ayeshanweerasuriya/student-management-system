interface NavBarProps {
  isStudentRClicked: boolean;
  setIsStudentRClicked: React.Dispatch<React.SetStateAction<boolean>>;
  isViewListClicked: boolean;
  setIsViewListClicked: React.Dispatch<React.SetStateAction<boolean>>;
}

function NavBar({
  setIsStudentRClicked,
  setIsViewListClicked,
  isStudentRClicked,
  isViewListClicked,
}: NavBarProps): JSX.Element {
  const stuRegisHandler = () => {
    setIsStudentRClicked(true);
    setIsViewListClicked(false);
  };

  const viewListHandler = () => {
    setIsViewListClicked(true);
    setIsStudentRClicked(false);
  };

  return (
    <div className="flex justify-center">
      <button
        onClick={stuRegisHandler}
        className={`m-2 py-2 px-3 rounded-lg text-white font-bold shadow-lg ${
          isStudentRClicked
            ? "bg-green-500 hover:bg-green-600 active:bg-green-700"
            : "bg-gray-500 hover:bg-gray-600 active:bg-gray-700"
        }`}
      >
        Student Registration
      </button>
      <button
        onClick={viewListHandler}
        className={`m-2 py-2 px-3 rounded-lg text-white font-bold shadow-lg ${
          isViewListClicked
            ? "bg-green-500 hover:bg-green-600 active:bg-green-700"
            : "bg-gray-500 hover:bg-gray-600 active:bg-gray-700"
        }`}
      >
        View Student List
      </button>
    </div>
  );
}

export default NavBar;
