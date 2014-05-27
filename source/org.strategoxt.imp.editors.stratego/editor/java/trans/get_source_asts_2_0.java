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

@SuppressWarnings("all") public class get_source_asts_2_0 extends Strategy 
{ 
  public static get_source_asts_2_0 instance = new get_source_asts_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4179, Strategy x_4179)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_source_asts_2_0");
    Fail21338:
    { 
      IStrategoTerm s_4179 = null;
      IStrategoTerm u_4179 = null;
      IStrategoTerm v_4179 = null;
      s_4179 = term;
      term = get_source_files_2_0.instance.invoke(context, s_4179, w_4179, x_4179);
      if(term == null)
        break Fail21338;
      term = parse_source_files_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21338;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21338;
      u_4179 = term.getSubterm(0);
      v_4179 = term.getSubterm(1);
      term = termFactory.makeTuple(u_4179, v_4179);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}