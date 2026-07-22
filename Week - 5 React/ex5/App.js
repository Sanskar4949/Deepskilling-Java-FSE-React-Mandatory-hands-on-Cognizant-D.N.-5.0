import "./App.css";
import cohorts from "./data";
import CohortDetails from "./Components/CohortDetails";

function App() {
  return (
    <div>
      <h1>Cohorts Details</h1>

      <div className="container">
        {cohorts.map((cohort) => (
          <CohortDetails key={cohort.id} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;