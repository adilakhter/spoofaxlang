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

@SuppressWarnings("all") public class elem_of_0_1 extends Strategy 
{ 
  public static elem_of_0_1 instance = new elem_of_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4181)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("elem_of_0_1");
    Fail21345:
    { 
      IStrategoTerm u_4181 = null;
      u_4181 = term;
      term = termFactory.makeTuple(u_4181, t_4181);
      term = elem_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21345;
      term = u_4181;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}