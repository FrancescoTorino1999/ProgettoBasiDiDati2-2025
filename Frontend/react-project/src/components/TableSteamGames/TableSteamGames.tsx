import { Link } from "react-router-dom";

function TableSteamGames(props: { steamgames: {  
        AppID: number;
        Name: string;
        "Release date": string;
        "Estimated owners": string;
        "Peak CCU": number;
        "Required age": number;
        Price: number;
        "DLC count": number;
        "About the game": string;
        "Supported languages": string[];
        "Full audio languages": string[];
        Reviews: string;
        "Header image": string;
        Website: string;
        "Support url": string;
        "Support email": string;
        Windows: boolean;
        Mac: boolean;
        Linux: boolean;
        "Metacritic score": number;
        "Metacritic url": string;
        "User score": number;
        Positive: number;
        Negative: number;
        "Score rank": string;
        Achievements: number;
        Recommendations: number;
        Notes: string;
        "Average playtime forever": number;
        "Average playtime two weeks": number;
        "Median playtime forever": number;
        "Median playtime two weeks": number;
        Developers: string;
        Publishers: string;
        Categories: string;
        Genres: string;
        Tags: string;
        Screenshots: string[];
        Movies: string;
    }[] }) {

    const { steamgames } = props;

    return (
        <div className="table-container">
            <table className="table_users">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Data di rilascio</th>
                        <th>Prezzo</th>
                        <th>Indirizzo</th>
                        <th>Dettagli</th>
                    </tr>
                </thead>
                <tbody>
                    {steamgames.map((steamgame, index) => (
                        <tr key={index}>
                            <td>{steamgame.Name}</td>
                            <td>{steamgame["Release date"]}</td>
                            <td>{steamgame["Price"]}</td>
                            <td><img alt = "" src='{steamgame["Header image"]}'/></td>
                            <td>
                                <Link className="details-link" to={`/user/${index}`}>Dettagli</Link>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default TableSteamGames;