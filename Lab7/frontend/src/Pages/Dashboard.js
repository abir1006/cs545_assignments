import Post from "../Components/Post";
import {useEffect, useState} from "react";
import axios from "../Config/api";
import PostDetails from "../Components/PostDetails";
import AddPostForm from "../Components/AddPostForm";


const Dashboard = () => {

    const [posts, setPosts] = useState([]);
    const [postDetailsID, setPostDetailsID] = useState(100);
    const [addPost, setAddPost] = useState(false);

    useEffect(() => {
        loadPosts();
    }, []);

    const loadPosts = () => {
        axios.get("posts")
            .then(response => {
                setPosts(response.data);
            })
            .catch(error => console.log(error));
    }

    const reloadPostsHandler = () => {
        loadPosts();
    }

    return <div className="container py-3">
        <div className={`row`}>
            <div className={`col-12`}>
                <div className={`py-3`}>
                    {!addPost && <button
                        onClick={e => setAddPost(true)}
                        className="btn btn-outline-primary float-end"
                        type="button">Add Post
                    </button>}
                    {addPost && <button
                        onClick={e => setAddPost(false)}
                        className="btn btn-outline-danger float-end"
                        type="button">Cancel
                    </button> }
                </div>
            </div>
            {addPost && <AddPostForm reloadPostsHandler={reloadPostsHandler} />}
        </div>

        <div className={`row`}>
            <h2 className={`mt-3 mb-3`}>All posts </h2>
            {
                posts.map(post => {
                    return <Post
                        key={post.id}
                        setPostDetailsID={setPostDetailsID}
                        post={post}/>
                })
            }
        </div>

        <PostDetails
            postDetailsID={postDetailsID}
            posts={posts}
            reloadPostsHandler={reloadPostsHandler} />
    </div>
}

export default Dashboard;