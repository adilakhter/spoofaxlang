package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9251 extends Strategy 
{ 
  public static final lifted9251 instance = new lifted9251();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28806:
    { 
      IStrategoTerm term10252 = term;
      Success11375:
      { 
        Fail28807:
        { 
          term = $Is$Imported_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28807;
          if(true)
            break Success11375;
        }
        term = term10252;
        IStrategoTerm term10253 = term;
        Success11376:
        { 
          Fail28808:
          { 
            term = input_descriptor_import_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28808;
            term = fetch_imports_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28808;
            if(true)
              break Success11376;
          }
          term = $On$Import$Failure_0_0.instance.invoke(context, term10253);
          if(term == null)
            break Fail28806;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}