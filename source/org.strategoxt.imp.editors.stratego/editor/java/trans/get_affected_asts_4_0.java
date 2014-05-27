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

@SuppressWarnings("all") public class get_affected_asts_4_0 extends Strategy 
{ 
  public static get_affected_asts_4_0 instance = new get_affected_asts_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4736, Strategy v_4736, Strategy w_4736, Strategy x_4736)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_affected_asts_4_0");
    Fail22824:
    { 
      IStrategoTerm q_4736 = null;
      IStrategoTerm s_4736 = null;
      IStrategoTerm t_4736 = null;
      q_4736 = term;
      term = get_source_files_2_0.instance.invoke(context, q_4736, u_4736, v_4736);
      if(term == null)
        break Fail22824;
      term = parse_affected_asts_2_0.instance.invoke(context, term, w_4736, x_4736);
      if(term == null)
        break Fail22824;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22824;
      s_4736 = term.getSubterm(0);
      t_4736 = term.getSubterm(1);
      term = termFactory.makeTuple(s_4736, t_4736);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}