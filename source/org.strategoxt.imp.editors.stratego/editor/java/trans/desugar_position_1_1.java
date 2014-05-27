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

@SuppressWarnings("all") public class desugar_position_1_1 extends Strategy 
{ 
  public static desugar_position_1_1 instance = new desugar_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4758, IStrategoTerm h_4758)
  { 
    context.push("desugar_position_1_1");
    Fail22953:
    { 
      IStrategoTerm i_4758 = null;
      i_4758 = term;
      term = at_position_1_1.instance.invoke(context, h_4758, lifted6816.instance, i_4758);
      if(term == null)
        break Fail22953;
      lifted6817 lifted68170 = new lifted6817();
      lifted68170.o_4758 = o_4758;
      term = topdown_1_0.instance.invoke(context, term, lifted68170);
      if(term == null)
        break Fail22953;
      term = position_of_term_1_0.instance.invoke(context, term, lifted6820.instance);
      if(term == null)
        break Fail22953;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}