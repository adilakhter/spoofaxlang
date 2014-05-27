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

@SuppressWarnings("all") public class throw_$Content$Proposals_1_1 extends Strategy 
{ 
  public static throw_$Content$Proposals_1_1 instance = new throw_$Content$Proposals_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4336, IStrategoTerm i_4336)
  { 
    context.push("throw_ContentProposals_1_1");
    Fail22264:
    { 
      IStrategoTerm l_4336 = null;
      l_4336 = term;
      term = dr_throw_1_2.instance.invoke(context, l_4336, j_4336, i_4336, trans.const4401);
      if(term == null)
        break Fail22264;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}