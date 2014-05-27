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

@SuppressWarnings("all") public class $Debug$All_0_0 extends Strategy 
{ 
  public static $Debug$All_0_0 instance = new $Debug$All_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87741:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDebugAll_0 != ((IStrategoAppl)term).getConstructor())
        break Fail87741;
      if(true)
        return term;
    }
    context.push("DebugAll_0_0");
    context.popOnFailure();
    return null;
  }
}