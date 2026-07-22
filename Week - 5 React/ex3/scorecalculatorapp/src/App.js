import { CalculateScore } from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Steeve"
        School="XYZ High School"
        total={85}
        goal={100}
      />
    </div>
  );
}

export default App;