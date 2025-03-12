import { Link } from "react-router-dom";
import "./TableUsers.scss";

function TableUsers(props: { users: { nome: string, email: string, eta: number }[] }) {
    const { users } = props;

    return (
        <div className="table-container">
            <table className="users-table">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Età</th>
                        <th>Dettagli</th>
                    </tr>
                </thead>
                <tbody>
                    {users.map((user, index) => (
                        <tr key={index}>
                            <td>{user.nome}</td>
                            <td>{user.email}</td>
                            <td>{user.eta}</td>
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

export default TableUsers;