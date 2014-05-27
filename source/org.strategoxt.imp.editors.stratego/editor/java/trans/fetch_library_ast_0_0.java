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

@SuppressWarnings("all") public class fetch_library_ast_0_0 extends Strategy 
{ 
  public static fetch_library_ast_0_0 instance = new fetch_library_ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_library_ast_0_0");
    Fail21664:
    { 
      term = termFactory.makeTuple(termFactory.makeAppl(Main._consIncludeFromPath_1, new IStrategoTerm[]{term}), trans.constNil3);
      term = pack_stratego_parse_stratego_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21664;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}