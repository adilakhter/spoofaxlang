package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class delete_elements_1_0 extends Strategy 
{ 
  public static delete_elements_1_0 instance = new delete_elements_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4728)
  { 
    context.push("delete_elements_1_0");
    Fail22796:
    { 
      IStrategoTerm d_4728 = null;
      d_4728 = term;
      term = d_4728;
      lifted6739 lifted67390 = new lifted6739();
      lifted67390.f_4728 = f_4728;
      term = topdown_1_0.instance.invoke(context, term, lifted67390);
      if(term == null)
        break Fail22796;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}