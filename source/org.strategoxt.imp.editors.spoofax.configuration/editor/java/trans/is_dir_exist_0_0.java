package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_dir_exist_0_0 extends Strategy 
{ 
  public static is_dir_exist_0_0 instance = new is_dir_exist_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_dir_exist_0_0");
    Fail87631:
    { 
      IStrategoTerm s_17561 = null;
      s_17561 = term;
      term = file_exists_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87631;
      term = filemode_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87631;
      term = isdir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87631;
      term = s_17561;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}