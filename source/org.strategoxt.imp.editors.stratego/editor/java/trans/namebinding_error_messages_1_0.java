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

@SuppressWarnings("all") public class namebinding_error_messages_1_0 extends Strategy 
{ 
  public static namebinding_error_messages_1_0 instance = new namebinding_error_messages_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4184)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("namebinding_error_messages_1_0");
    Fail21357:
    { 
      IStrategoTerm g_4184 = null;
      IStrategoTerm h_4184 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21357;
      g_4184 = term.getSubterm(0);
      h_4184 = term.getSubterm(1);
      term = termFactory.makeTuple(g_4184, h_4184);
      term = collect_binding_violations_1_0.instance.invoke(context, term, k_4184);
      if(term == null)
        break Fail21357;
      term = map_1_0.instance.invoke(context, term, mk_binding_violation_message_0_0.instance);
      if(term == null)
        break Fail21357;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}